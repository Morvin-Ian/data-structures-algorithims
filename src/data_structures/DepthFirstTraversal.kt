package data_structures

private fun <T:Comparable<T>>traverseDepthFirstPreOrder(tree: BST<T>): List<T> {
    val result = mutableListOf<T>()
    val stack = Stack<BinaryNode<T>>()

    tree.root?.let { stack.push(it) }

    while (stack.isNotEmpty()) {
        val node = stack.pop()
        node?.let {
            result.add(it.data)

            it.right?.let { rightNode -> stack.push(rightNode) }
            it.left?.let { leftNode -> stack.push(leftNode) }
        }
    }

    return result
}

fun <T:Comparable<T>>traverseDepthFirstInOrder(tree: BST<T>): List<T> {
    val result = mutableListOf<T>()
    val stack = Stack<BinaryNode<T>>()

    var current = tree.root
    while (current != null || stack.isNotEmpty()) {
        while (current != null) {
            stack.push(current)
            current = current.left
        }

        current = stack.pop()
        current?.let {
            result.add(it.data)
            current = it.right
        }
    }

    return result
}

fun <T:Comparable<T>>traverseDepthFirstPostOrder(tree: BST<T>): List<T> {
    val result = mutableListOf<T>()
    val stack = Stack<BinaryNode<T>>()

    tree.root?.let { stack.push(it) }

    while (stack.isNotEmpty()) {
        val node = stack.peek()
        if (node?.left == null && node?.right == null) {
            val visitedNode = stack.pop()
            visitedNode?.let { result.add(it.data) }
        } else {
            node.right?.let { stack.push(it) }
            node.right = null

            node.left?.let { stack.push(it) }
            node.left = null
        }
    }

    return result
}