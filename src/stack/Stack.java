package stack;

import java.util.ArrayList;

public class Stack<T> {

	ArrayList<T> arrayList=new ArrayList<T>();
	

 public void push(T value)
 {
	 arrayList.add(value);
	 
 }
 public T pop()
 {
  return arrayList.remove(arrayList.size()-1);
  
 }
 public int size()
 {
  return arrayList.size();
  
 }
 public T peek()

 {
	 return arrayList.get(arrayList.size()-1);
 }
 public boolean isEmpty()
 {
	if(arrayList.size()==0)
	{
		return true;
	}
	else
	{
		return false;
	}
 }
 @Override
 public String toString() {
     return arrayList.toString();
 }
}
