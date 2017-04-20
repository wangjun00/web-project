package XunHuan1;

public class SanJiao {

	public static void main(String[] args) {
		
			int size = 6; /* 三角形的高 */

				for (int i = 0; i < size; i++) { /* for循环 */
					for (int x = -6; x <= size - i; x++) { /* 改变x的参数，使三角形位置平移 */
						System.out.print("-");
					}
					for (int j = 1; j <= i * 2 + 1; --j) {
						System.out.print("*");
					}
					System.out.println();
					// }
				}
	}

}
