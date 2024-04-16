package algorithims.sorting

fun bubbleSort(array: MutableList<Int>):MutableList<Int>{
    for (index in 0..array.lastIndex){
        for (x in index+1..array.lastIndex){
            if(array[index] > array[x]){
                val temp = array[index]
                array[index] = array[x]
                array[x] = temp
            }
        }
    }

    return array
}