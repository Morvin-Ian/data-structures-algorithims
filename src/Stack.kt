interface StackBluePrint <T:Any>{
    fun push(element: T)
    fun pop()
    fun empty():Boolean
    fun peek():T?
}

class Stack<T:Any>: StackBluePrint<T>{

    val data = arrayListOf<T>()

    override fun push(element: T) {
        data.add(element)
    }

    // Remove the last element
    override fun pop() {
        if(data.size > 0) {
            data.removeAt(data.size-1)
        }
    }

    override fun empty():Boolean {
        return data.isEmpty()
    }

    override fun peek():T?{
        return data[data.size-1]
    }

}