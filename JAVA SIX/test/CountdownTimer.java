package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class CountdownTimer {
    private JFrame frame;
    private JTextField hourField, minuteField, secondField;
    private JButton startButton;
    private Timer timer;

    public CountdownTimer() {
        // 創建和設置窗口
        frame = new JFrame("Countdown Timer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(5, 2));

        // 添加標籤和文本框供用戶輸入時間
        frame.add(new JLabel("Hours:"));
        hourField = new JTextField(5);
        frame.add(hourField);

        frame.add(new JLabel("Minutes:"));
        minuteField = new JTextField(5);
        frame.add(minuteField);

        frame.add(new JLabel("Seconds:"));
        secondField = new JTextField(5);
        frame.add(secondField);

        // 添加開始按鈕並處理點擊事件
        startButton = new JButton("Start Countdown");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int hours = Integer.parseInt(hourField.getText().isEmpty() ? "0" : hourField.getText());
                    int minutes = Integer.parseInt(minuteField.getText().isEmpty() ? "0" : minuteField.getText());
                    int seconds = Integer.parseInt(secondField.getText().isEmpty() ? "0" : secondField.getText());
                    startCountdown(hours, minutes, seconds);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers.");
                }
            }
        });
        frame.add(startButton);

        // 顯示窗口
        frame.setVisible(true);
    }

    private void startCountdown(int hours, int minutes, int seconds) {
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int remainingSeconds = totalSeconds;

            @Override
            public void run() {
                if (remainingSeconds <= 0) {
                    timer.cancel();
                    // JOptionPane.showMessageDialog(frame, "Time's up!");
                    playSound("C:\\Users\\mmx\\Desktop\\JAVA SIX\\test\\alarm.wav"); // 使用完整路徑來播放音效
                    // Reset the fields to zero
                    hourField.setText("0");
                    minuteField.setText("0");
                    secondField.setText("0");
                } else {
                    remainingSeconds--;
                    hourField.setText("" + remainingSeconds / 3600);
                    minuteField.setText("" + (remainingSeconds % 3600) / 60);
                    secondField.setText("" + (remainingSeconds % 60));
                }
            }
        }, 0, 1000);
    }

    private void playSound(String soundFileName) {
        try {
            File soundFile = new File(soundFileName);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Error playing sound file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CountdownTimer();
            }
        });
    }
}
