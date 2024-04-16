package algorithims.searching

fun binarySearch(value:Int, array: Array<Int>):Int?{
    for(index in 0..array.lastIndex){
        var low = 0
        var high = array.lastIndex
        var mid = (low + high)/2

        while(low <= mid){
            if (array[mid] == value){
                return mid
            }
            else if(array[mid] > value){
                low = mid + 1
            }else{
                high = mid + 1
            }
        }

    }

    return  null
}