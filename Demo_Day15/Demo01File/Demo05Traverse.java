package Demo01File;

/*
    * `public String[] list()`   ：返回一个String数组，表示该File目录中的所有子文件或目录。
    * `public File[] listFiles()`：返回一个File数组，表示该File目录中的所有的子文件或目录。
    * 目标路径不存在或者路径不是一个目录，都会抛出空指针异常
 */

import java.io.File;

public class Demo05Traverse {
    public static void main(String[] args) {
        File dir = new File("D:\\document\\Scripts\\Java_Advanced\\Day08_File_Recursion\\src\\Demo01File");

        //获取当前目录下的文件以及文件夹的名称
        String[] arr1 = dir.list();
        for (String file : arr1) {
            System.out.println(file);
        }
/*
        Demo01FileOverview.java
        Demo02GetPath.java
        Demo03EstimatePath.java
        Demo04CreateDelete.java
        Demo05Traverse.java
*/

        System.out.println("--------------------------");

        File[] arr2 = dir.listFiles();
        for (File file : arr2) {
            System.out.println(file);
        }
/*
        D:\document\Scripts\Java_Advanced\Day08_File_Recursion\src\Demo01File\Demo01FileOverview.java
        D:\document\Scripts\Java_Advanced\Day08_File_Recursion\src\Demo01File\Demo02GetPath.java
        D:\document\Scripts\Java_Advanced\Day08_File_Recursion\src\Demo01File\Demo03EstimatePath.java
        D:\document\Scripts\Java_Advanced\Day08_File_Recursion\src\Demo01File\Demo04CreateDelete.java
        D:\document\Scripts\Java_Advanced\Day08_File_Recursion\src\Demo01File\Demo05Traverse.java
*/
    }
}
