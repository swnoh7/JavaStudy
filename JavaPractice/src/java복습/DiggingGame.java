package java복습;

import java.util.Scanner;

public class DiggingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] gameMap = {
            {'#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', '#', '#', '#', '#'}
        };

        int playerX = 3;
        int playerY = 0;

        gameMap[playerY][playerX] = '옷'; // '옷'으로 플레이어 초기화

        while (true) {
            printMap(gameMap);

            char input = scanner.next().charAt(0);

            if (input == 'a' && playerX > 0) {
                gameMap[playerY][playerX] = '#';
                playerX--;
                gameMap[playerY][playerX] = '옷';
            } else if (input == 'd' && playerX < 6) {
                gameMap[playerY][playerX] = '#';
                playerX++;
                gameMap[playerY][playerX] = '옷';
            } else if (input == 'w' && playerY > 0) {
                gameMap[playerY][playerX] = '#';
                playerY--;
                gameMap[playerY][playerX] = '옷';
            } else if (input == 's' && playerY < 4) { // 수정된 부분
                if (gameMap[playerY + 1][playerX] == '#') {
                    gameMap[playerY + 1][playerX] = ' ';
                    // 아래로 파기 후 3줄 추가
                    addThreeRows(gameMap);
                }
            } else if (input == ' ') {
                // 아래로 파기
                if (playerY < 6 && gameMap[playerY + 1][playerX] == '#') { // 수정된 부분
                    gameMap[playerY + 1][playerX] = ' ';
                }
            }
        }
    }

    public static void printMap(char[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void addThreeRows(char[][] map) {
        // 가장 아래에 3줄 추가
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[4 + i][j] = '#';
            }
        }
    }
}

