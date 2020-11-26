/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quickfinduf;

/**
 *
 * @author cw
 */
public class QuickFindUF {

   private int[]id;
   private int count;
   int p=3; int q=4;
   int n=10;
  public QuickFindUF (int n){
    count=n;  
    id= new int[n];
    for(int i=0; i<n; i++){
     id[i]=i;   
    }
    }
  public int count(){
      return count();
  }
  public int find (int p){
  validate(p);
  return id[p];
  }
  private void validate(int p){
  int n=id.length;
  if(p<0 || p>=n){
   throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n-1)); 
  }
  }
  public boolean connected (int p, int q){
  validate(p);
  validate(q);
  return id[p]==id[q];
  }
  public void union(int p ,int q){
 validate(p);
  validate(q);
  int pID=id[p];
  int qID=id[q];
  if(pID==qID)return;
  for(int i=0;i<id.length;i++)
      if(id[i]==pID)
      {  id[i]=qID;
      
      }
  count --;
  
  }
   
      public static void main(String[] args) {
     int p=3; int q=4;
   
   int n= 10;
          System.out.println(n);
        QuickFindUF uf = new QuickFindUF(n);
      
      while(System.in != null) {
          System.out.println(p);
           System.out.println(q);
      
      
        if (uf.find(p) == uf.find(q)) 
        
          continue;
            uf.union( p,q);
            System.out.println(p+" "+q);
      } 
        System.out.println(uf.count() + " components");

    
      }  
}
