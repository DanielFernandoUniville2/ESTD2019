
public class SelectionSort {
	
	int i,j,k,pos,temp;  
    for(i=0;i<10;i++)  
    {  
        pos = smallest(a,10,i);  
        temp = a[i];  
        a[i]=a[pos];  
        a[pos] = temp;  
    }  
    System.out.println("\nprinting sorted elements...\n");  
    for(i=0;i<10;i++)  
    {  
        System.out.println(a[i]);  
    }  
}  

public static int smallest(int a[], int n, int i)  
{  
    int small,pos,j;  
    small = a[i];  
    pos = i;  
    for(j=i+1;j<10;j++)  
    {  
        if(a[j]<small)  
        {  
            small = a[j];  
            pos=j;  
        }  
    }  
    return pos;  
}  

}
