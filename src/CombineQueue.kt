
fun combineQueue(q1:Queue<*>, q2:Queue<*>):Queue<*> {
    val combinedList = Queue<Any>()
    while (true){
        q1.dequeue()?.let { combinedList.enqueue(it) }
        q2.dequeue()?.let { combinedList.enqueue(it) }

        if (q1.peek() == null && q2.peek() == null) {
            break
        }
    }

    return combinedList
}

