package org.example.abstracttask;

public class Algorithm {

    public static void main(String[] args) {


        int[] arr = {1, 7, 9, 10, 14};
        //  hedef  = 9 ededidir;
        int target = 14;
        // sol indeks = 0 cci indekse yeni =1;
        int left = 0;
        // sag indeks ise arrays uzunluq 5-1=4cu indekse
        int right = arr.length - 1;

        while (left<=right){
            // mid = 0+4=4/2=2 mid 2ci indekse beraberdir - 9 ededi
            int mid = (left+right)/2;

            // eger orta axtardigimiz edede beraberdise
            if (arr[mid]==target){
                //bunu cap et
                System.out.println("Axtardigimiz eded tapildi: "+mid);
                break;
                //   eger deyilse mid > axtardigimiz ededden boyukdurse
            }else if (arr[mid]>target){
                //        = 2 -1 =1 ci indekse right
                right = mid-1;

                //  yox deyilsede
            }else {
                //     sol   = 2+1=3 ci idenkde
                left = mid+1;
            }
        }

    }
}
