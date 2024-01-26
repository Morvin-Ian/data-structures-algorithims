fun <T:Comparable<T>>traverseDepthFirst(tree: BST<T>): List<T> {
    val stack = Stack<BinaryNode<T>>()
    val result = mutableListOf<T>()

    tree.root?.let { stack.push(it) }

    var current = tree.root
    while (current != null || !stack.empty()) {
        while (current != null) {
            stack.push(current)
            current = current.left
        }

        stack.pop()
        current?.let {
            result.add(it)
            current = it
        }
    }

    return result

}
