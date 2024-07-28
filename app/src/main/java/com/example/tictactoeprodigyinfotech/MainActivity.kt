package com.example.tictactoeprodigyinfotech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tictactoeprodigyinfotech.databinding.ActivityMainBinding
import com.example.tictactoeprodigyinfotech.model.GameData
import com.example.tictactoeprodigyinfotech.model.GameModel
import com.example.tictactoeprodigyinfotech.model.GameStatus

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startButton.setOnClickListener {
            creatGame()
        }

    }

    private fun creatGame() {
        GameData.saveGameModel(
            GameModel(
                gameStatus = GameStatus.JOINED
            )
        )
        startGame()
    }

    private fun startGame(){
        startActivity(Intent(this, GameActivity::class.java))
    }
}