function bubblesort(data)
{
    var len=data.length;
    do
    {
        for(i=0;i<len-1;i++)
        {
            if(data[i]>data[i+1])
            {
                swap(data,i,i+1);
            }
        }
        while(len--);
        return data;
    }
    function swap(arr,index a,index b)
    {
        var tmp=arr[index a];
        arr[index a]=arr[index b];
        arr[index b]=temp;
    }
}