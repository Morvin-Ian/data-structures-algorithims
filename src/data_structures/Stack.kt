package data_structures
class Stack<T:Any>{

    val data = arrayListOf<T>()
    val size get() = data.size

    fun push(element: T) {
        data.add(element)
    }

    fun pop() = if (data.isEmpty()) null else data.removeAt(data.lastIndex)

    fun peek() = data.lastOrNull()

    fun isEmpty() = data.isEmpty()

    fun isNotEmpty() = data.isNotEmpty()

}