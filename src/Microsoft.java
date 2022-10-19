public class Microsoft {
    public static void main(String[] args) {
        int[] sortedArr = new int[] {0, 0, 1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9};

                int l = sortedArr.length - 1;
                int pos = l/2;
                int b = 0;


                while (sortedArr[pos] == sortedArr[pos + 1] || sortedArr[pos] == sortedArr[pos - 1]) {
                    pos = (l + b) / 2;
                    if (pos % 2 == 0) { //if the pos we find is even
                        if (sortedArr[pos] == sortedArr[pos + 1]) {
                            //pos = ((l - pos) / 2 + pos); //num is after
                            b = pos + 1;
                        } else if (sortedArr[pos] == sortedArr[pos - 1]) {
                            //pos = pos/2; //num is before
                            l = pos - 1;
                        }
                    } else { //pos is odd
                        if (sortedArr[pos] == sortedArr[pos + 1]) {
                            //pos = pos/2; //num is before
                            l = pos - 1;
                        } else if (sortedArr[pos] == sortedArr[pos] - 1) {
                            //pos = ((l - pos) / 2 + pos); //num is after
                            b = pos + 1;
                        }

                    }
                }
                System.out.println("The non-duplicated number is: " + sortedArr[pos]);

                //System.out.println("The non-duplicated number is: " + String.valueOf(x));



            }

        }