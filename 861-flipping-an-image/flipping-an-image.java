class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row=image.length;
        int col=image[0].length;

        for(int [] arr:image){

            
                int left =0;
                int right =arr.length-1;
                while(left<right){
                    int temp =arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                    left++;
                    right--;

                }
            
            
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(image[i][j]==1){
                     image[i][j]=0;
                }else{
                    image[i][j]=1;
                }
            }
        }
        return image;
    }
}