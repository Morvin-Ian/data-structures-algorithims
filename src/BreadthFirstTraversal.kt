import BST
fun <T:Comparable<T>>traverseBreathFirst(tree: BST<T>): List<T> {
        val queue = Queue<BinaryNode<T>>()
        val result = mutableListOf<T>()

        if (tree.isEmpty()) {
            return result
        } else {
            tree.root?.let { queue.enqueue(it) }
        }

        while (queue.isNotEmpty()) {
            val current = queue.dequeue() ?: break

            result.add(current.data)

            current.left?.let { queue.enqueue(it) }
            current.right?.let { queue.enqueue(it) }
        }

        return result
}


