class Program1{
void Sort(int arr[]){
int n=arr.length;{
for(int i=0;j<n;i++){
if(i==j){
if(j==i){
int min=i;
for(int j=0;j<n;j++)
if(arr[j]<arr [i]);
min=j;
int temp=arr[i];
arr[i]=temp;
}
}
Void display(int arr[]);
int n=arr.length;
for(int i=0; j<n;n++){
System.out.print(arr[i]+" ");
System.out.print();
}
public static void main(String args[]){
Program1 p=new Program();
int arr=[45,9,35,-6,4];
System.out.println("Array elements before sort");
p.display(arr);
p.sort(arr);
System.out.println("Array after sort");
p.display(arr);
}
}
}
