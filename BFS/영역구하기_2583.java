package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 영역구하기_2583 {
    static int n, m, k;
    static int[][] map;
    static boolean[][] visited;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int section_cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();

        map = new int[n][m];
        visited = new boolean[n][m];

        // mapping
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int sx = Integer.parseInt(st.nextToken());
            int sy = Integer.parseInt(st.nextToken());
            int ex = Integer.parseInt(st.nextToken());
            int ey = Integer.parseInt(st.nextToken());

            for (int x = sx; x < ex; x++) {
                for (int y = sy; y < ey; y++) {
                    map[y][x] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    list.add(bfs(i, j));
                    section_cnt++;
                }
            }
        }
        Collections.sort(list);
        System.out.println(section_cnt);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }


    }

    public static int bfs(int a, int b) {
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{a, b});
        map[a][b] = 2;
        visited[a][b] = true;
        int size = 1;

        while (!que.isEmpty()) {
            int[] temp = que.poll();
            int x = temp[0];
            int y = temp[1];
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                if (isIn(nx, ny)) {
                    if (map[nx][ny] == 0 && !visited[nx][ny]) {
                        map[nx][ny] = 2;
                        visited[nx][ny] = true;
                        que.add(new int[]{nx, ny});
                        size++;
                    }
                }
            }
        }
        return size;
    }

    public static boolean isIn(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }

}
