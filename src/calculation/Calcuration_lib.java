package calculation;

public class Calcuration_lib {
 private int m,n;

 public Calcuration_lib(int m, int n) {

	this.m = m;
	this.n = n;
 }
 public int getPlus(){
	 return m+n;
 }
 public int getMinus(){
	 return m-n;
 }
 public int getProduct(){
	 return m*n;
 }
 public int getDivide(){
	 return m/n;
 }
 public int getMod(){
	 return m%n;
 }
}
