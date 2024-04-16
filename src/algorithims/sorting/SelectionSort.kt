package algorithims.sorting

fun selectionSort(array: MutableList<Int>):MutableList<Int>{
    for (index in 0..array.lastIndex){
       var minIndex = index
        for (x in index+1..array.lastIndex){
            if(array[minIndex] > array[x]){
                minIndex = x
            }
            if (minIndex != index) {
                val temp = array[index]
                array[index] = array[minIndex]
                array[minIndex] = temp
            }
        }
    }

    return array
}