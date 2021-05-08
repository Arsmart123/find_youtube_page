
/**
 * 在这里给出对类 Part4 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
import edu.duke.*; 

public class Part4 { 

    public void links() 

    { 

       String url = "https://www.dukelearntoprogram.com/course2/data/manylinks.html"; 

       URLResource ur = new URLResource(url); 

       //System.out.println(ur.asString()); 

       for(String link : ur.lines()) 

       { 

            

           int pos = link.indexOf("\"http"); 

           if(pos!= -1) 

           { 

               String temp = link.substring(pos,link.indexOf("\">")); 

               String temp2 = temp.toLowerCase(); 

               if(temp2.indexOf("youtube") != -1) 

               { 

                    System.out.println(temp); 

               } 

           } 

        } 

         

    } 

}
