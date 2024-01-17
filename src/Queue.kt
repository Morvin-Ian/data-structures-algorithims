interface QueueBluePrint<T:Any>{
    fun dequeue():T?
    fun enqueue(element: T)
    fun peek():T?
}

open class Queue<T:Any>: QueueBluePrint<T>{
    val data = arrayListOf<T>()
    override fun dequeue():T?{
        return if(data.isEmpty()) null else data.removeAt(0)
    }
    override fun enqueue(element: T){
        data.add(element)
    }
    override fun peek():T?{
        return data.getOrNull(0)
    }

    fun isEmpty() = data.isEmpty()

    fun isNotEmpty() = data.isNotEmpty()

}