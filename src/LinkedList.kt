data class Node<T>(var value: T, var next: Node<T>? = null) {
    override fun toString(): String {
        return if (next != null) {
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }
}

class LinkedList<T> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        if (isEmpty()) {
            return "Empty list"
        } else {
            return head.toString()
        }
    }

    // Adding a Node to the
    fun push(value: T) {
        head = Node(value = value, next = head)
        if (tail == null) {
            tail = head
        }
        size++
    }
    fun append(value:T){
        if(isEmpty()){
            push(value)
        }
        tail?.next = Node(value=value)
        tail = tail?.next
        size++
    }

    fun findNodeAt(index:Int): Node<T>? {
        var currentNode = head
        var count = 0

        while (currentNode != null && count < index){
            currentNode = currentNode.next
            count++
        }
        return currentNode
    }

    fun insert(value: T, index: Int){
        
    }
}

