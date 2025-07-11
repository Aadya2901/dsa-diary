public class PracticeQs12_3 {

}

/*
 * FUNCTION transpose(matrix)
 * rows ← number of rows in matrix
 * cols ← number of columns in matrix
 * 
 * FOR i FROM 0 TO cols - 1
 * FOR j FROM 0 TO rows - 1
 * PRINT matrix[j][i], with space
 * END FOR
 * PRINT newline
 * END FOR
 * END FUNCTION
 * 
 * if storing in a new matrix:
 * 
 * pgsql
 * Copy
 * Edit
 * FUNCTION transpose(matrix)
 * rows ← number of rows
 * cols ← number of columns
 * CREATE newMatrix[cols][rows]
 * 
 * FOR i FROM 0 TO rows - 1
 * FOR j FROM 0 TO cols - 1
 * newMatrix[j][i] ← matrix[i][j]
 * END FOR
 * END FOR
 * 
 * RETURN newMatrix
 * END FUNCTION
 * 
 * Time Complexity (TC)
 * Let:
 * 
 * r = number of rows
 * 
 * c = number of columns
 * 
 * Metric Value
 * Time Complexity O(r × c)
 * Space Complexity O(1) if just printing
 * O(r × c) if storing in new matrix
 */