package com.amalraj.project1.test;
class Array{
public static void main(String args[]){
int values[]={10,20,30,40,50};
for(int i=0; i< values.length; i++){
System.out.println(values[i]);
}
System.out.println("foreach");
for(int val: values){
System.out.println(val);

}
}
}