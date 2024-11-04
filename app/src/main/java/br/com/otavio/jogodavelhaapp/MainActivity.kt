package br.com.otavio.jogodavelhaapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var statusTextView: TextView
    private lateinit var restartButton: Button
    private lateinit var gameGrid: GridLayout

    private var currentPlayer = "X"
    private val board = Array(3) { arrayOfNulls<String>(3) }
    private var isGameActive = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        statusTextView = findViewById(R.id.statusTextView)
        restartButton = findViewById(R.id.restartButton)
        gameGrid = findViewById(R.id.gameGrid)

        setUpGame()

        restartButton.setOnClickListener {
            resetGame()
        }
    }

    private fun setUpGame() {
        for (i in 0 until gameGrid.childCount) {
            val button = gameGrid.getChildAt(i) as Button
            button.text = ""
            button.setOnClickListener {
                onCellClicked(button, i / 3, i % 3)
            }
        }
        statusTextView.text = "Jogador X começa"
        currentPlayer = "X"
        isGameActive = true
    }

    private fun onCellClicked(button: Button, row: Int, col: Int) {
        if (button.text.isNotEmpty() || !isGameActive) return

        button.text = currentPlayer
        board[row][col] = currentPlayer

        if (checkWinner()) {
            statusTextView.text = "Jogador $currentPlayer venceu!"
            isGameActive = false
        } else if (isBoardFull()) {
            statusTextView.text = "Empate!"
            isGameActive = false
        } else {
            currentPlayer = if (currentPlayer == "X") "O" else "X"
            statusTextView.text = "Vez do jogador $currentPlayer"
        }
    }

    private fun checkWinner(): Boolean {
        // Verifica linhas, colunas e diagonais
        for (i in 0..2) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) return true
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) return true
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) return true
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) return true

        return false
    }

    private fun isBoardFull(): Boolean {
        for (row in board) {
            if (row.contains(null)) return false
        }
        return true
    }

    private fun resetGame() {
        for (i in 0 until gameGrid.childCount) {
            val button = gameGrid.getChildAt(i) as Button
            button.text = ""
        }
        for (row in board.indices) {
            for (col in board[row].indices) {
                board[row][col] = null
            }
        }
        currentPlayer = "X"
        statusTextView.text = "Jogador X começa"
        isGameActive = true
    }
}
