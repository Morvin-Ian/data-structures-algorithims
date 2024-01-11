interface BSTBluePrint<T:Any> {
    fun add(value:T)
    fun isPresent(value:T):T?
}

class BST<T:Any>:BSTBluePrint<T>{
    var root:Node<T>? = null
    var left: Node<T>? = null
    var right: Node<T>? = null
    override fun add(value: T) {
        val newNode = Node(value)

        if (root == null) {
            root = newNode
            return
        }
        // CONTINUE
    }

    override fun isPresent(value: T): T? {
        TODO("Not yet implemented")
    }

}