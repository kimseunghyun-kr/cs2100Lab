<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
  
public class Main {
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
  
        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
		
        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
  
            if (neg)
                return -ret;
            return ret;
        }
		
        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0,
                                 BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
  
        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
  
        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }
	
	public long solve(int[] a) {
		return 0;
	}
	
<<<<<<< Updated upstream
    public static void main(String[] args) throws IOException {
        Reader s = new Reader();	
		int n = s.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = s.nextInt();
		}
		for(int i=0; i<n; i++) {
			b[i] = s.nextInt();
		}
		System.out.println(0);
	}	
=======
    // public static void main(String[] args) throws IOException {
    //     Reader s = new Reader();	
	// 	int n = s.nextInt();
	// 	int[] a = new int[n];
	// 	int[] b = new int[n];
	// 	for(int i=0; i<n; i++) {
	// 		a[i] = s.nextInt();
	// 	}
	// 	for(int i=0; i<n; i++) {
	// 		b[i] = s.nextInt();
	// 	}
	// }	

    public class minInversions{

        int n
        int[] A;
        int[] B;
        int[] ans;

        public minInversions(int n int[]A, int[] B) {
            this.n = n;
            this.A = A;
            this.B = B;
            Arrays.sort(B);
            ans = new int[n];
        }

        //             You are given 2n distinct integers, a1, a2, a3, . . . , an, b1, b2, . . . , bn from 1 to 2n (inclusive).
// You are required to insert elements of b into the array a. Let c be the resulting array of size 2n
// after the insertion. For example, if a = [5, 4, 1, 2] and b = [8, 3, 6, 7], a possible way to insert elements
// of b into a is c = [5, 4, 3, 6, 8, 1, 7, 2] (elements of b are underlined).
// Note that the relative order of elements from array a must be preserved (i.e. if 5 comes before 4 in
// array a, then 5 must appear before 4 in array c. Among all possible insertion sequences, what is the
// minimum possible number of inversions c can have?

        public int[] main_solver() {
            solver(0, this.n);

            int[] arrAns = new int[2 * this.n];

            for(int i = 0 ; i < n ; i++){
                int Bkeeper = this.B[this.ans[i]]
                int atoInsert = this.A[i];
                int arrAnsIdx = i * 2;

                arrAns[arrAnsIdx] = atoInsert;
                arrAns[arrAnsIdx+1] = Bkeeper;
            }

            return this.ans;
        }

        public void solver(int startIdx, int endIdx, int[]) {
            int midIdx = (startIdx + endIdx) / 2 
            
            if(startIdx > endIdx) {
                return;
            } else {
                int midAelem = A[midIdx]
                int insertAtoSortedB = minInvIdx(B, midAelem);
                ans[midAelem] = insertAtoSortedB;
                solver(startIdx, midAelem-1);
                solver(midAelem + 1, endIdx);
            }
        }

        public static int minInvIdx(int[] arr, int tar) {
            for(int i = 0 ; i < arr.length() ; i++) {
                if(tar > arr[i]) {
                    return i-1;
                }
            }
            return arr.length();
        }

    }
    public static void main(String[] args) {
        int[] returnable = new minInversions(4, {5,4,1,2}, {8,3,6,7});
        System.out.println(returnable);
    }
>>>>>>> Stashed changes
}