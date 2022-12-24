import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Arraylist_Java {
    /*ArrayList 와 List 의 차이점
    *  List 는 인터페이스
    *  ArrayList 는 클래스
    *
    *
    *
    */
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>(); //  이런식으로 상속을 받고 사용해야 한다.
        ArrayList<Integer> arr1 = new ArrayList<Integer>();

        ArrayList<Integer> arr2 = new ArrayList<>(); // 자료형을 안정할수도 있음

        arr = new LinkedList<Integer>(); // List 클래스는 추상 메소드 즉 배열의 종류를 바꿀수 있다.

        // ArrayList 함수 (add,get,set,remove)

        arr1.add(1); // 원소 추가 는 add 함수
        arr1.add(2);

        System.out.println(arr1.get(0)); // index 를 통해 get 함수를 사용하여 원소의 값을 얻어올수 있음

        arr1.set(0,5); // index 를 통해 해당 원소의 값을 바꿀수 있다.

        System.out.println(arr1.get(0)); // 값의 변경

        arr1.remove(0); // 특정 인덱스 삭제시 사용
        System.out.println(arr1.get(0)); // 그 다음 원소가 삭제된 인덱스로 오게된다.


        System.out.println("배열의 길이 확인: " + arr1.size()); // 배열의 길이 확인할때 arr.size();

        // 2차원 배열
        Integer[][] ar = {{1,2,3},{4,5,6}};

        for(int i = 0; i<ar.length;i++){
            for(int j = 0; j<ar[0].length;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println(" ");
        }

        // 3차원 배열
        Integer [][][] Dim_3 = {
                {
                        {
                            1,2,3
                        },
                        {
                            4,5,6
                        }
                },
                {
                        {
                            7,8,9
                        },
                        {
                            10,11,12
                        }

                }

        };


        for(int i = 0; i<Dim_3.length; i++){
            for(int j=0; j<Dim_3[i].length;j++){
                for(int k=0;k<Dim_3[i][j].length;k++){
                    System.out.print(Dim_3[i][j][k] + " ");
                }
                System.out.println(" ");
            }
        }

        String dataset[] = {
                "Braund, Mr. Owen Harris",
                "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
                "Heikkinen, Miss. Laina",
                "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
                "Allen, Mr. William Henry",
                "Moran, Mr. James",
                "McCarthy, Mr. Timothy J",
                "Palsson, Master. Gosta Leonard",
                "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
                "Nasser, Mrs. Nicholas (Adele Achem)",
                "Sandstrom, Miss. Marguerite Rut",
                "Bonnell, Miss. Elizabeth",
                "Saundercock, Mr. William Henry",
                "Andersson, Mr. Anders Johan",
                "Vestrom, Miss. Hulda Amanda Adolfina",
                "Hewlett, Mrs. (Mary D Kingcome) ",
                "Rice, Master. Eugene",
                "Williams, Mr. Charles Eugene",
                "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
                "Masselmani, Mrs. Fatima",
                "Fynney, Mr. Joseph J",
                "Beesley, Mr. Lawrence",
                "McGowan, Miss. Anna",
                "Sloper, Mr. William Thompson",
                "Palsson, Miss. Torborg Danira",
                "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
                "Emir, Mr. Farred Chehab",
                "Fortune, Mr. Charles Alexander",
                "Dwyer, Miss. Ellen",
                "Todoroff, Mr. Lalio"
        };

        int count = 0;

        for(int i = 0; i<dataset.length;i++){
            if(dataset[i].indexOf("M")>=0){ //해당 글자의 포함 여부 python 에 index 함수랑 똑같음
                count++;
            }
        }

        System.out.println(count);

    }







}
