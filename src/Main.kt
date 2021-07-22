fun main() {
    print(areSimilar(mutableListOf(1, 2, 3),mutableListOf(1, 2, 3)))
}

fun areSimilar(a: MutableList<Int>, b: MutableList<Int>): Boolean {

    if(a.size==b.size){
        var count=0
        var count1=0
        var count2=0
        for(i in 0 until a.size){
            if(a[i] !in b)
                count1++
            else if(b[i] in a){
                if(a[i]!=b[i])
                    count++} }
        for(i in 0 until b.size)
            if(b[i] !in a)
                count2++
        if(count1>0 || count2>0)
            return false
        if(count==2||count==0)
            if(count==0)
                return true
            else{
                var index1=-1
                var index2=-1
                for(i in 0 until b.size)
                    if(b[i]!=a[i] && index1==-1)
                        index1=i
                    else if(b[i]!=a[i])
                        index2=i
                var temb:Int
                temb=b[index1]
                b[index1]=b[index2]
                b[index2]=temb
                if(a.equals(b))
                    return true
                else
                    return false
            }
        else
            return false
    }
    else
        return false
}