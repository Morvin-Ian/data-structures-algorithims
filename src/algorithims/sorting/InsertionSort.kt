package algorithims.sorting

fun insertionSort(array: MutableList<Int>):List<Int>{

    for (index in 1..array.lastIndex){
        val value = array[index]
        var hole = index

        while (hole > 0 && array[hole-1] > value){
            array[hole] = array[hole-1]
            hole -= 1
        }

        array[hole] = value
    }

    return array
}