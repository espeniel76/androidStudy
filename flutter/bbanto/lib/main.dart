import 'package:flutter/material.dart';
import 'package:speech_to_text/speech_to_text.dart' as stt;

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
      return MaterialApp(
          title: 'Flutter Demo',
          theme: ThemeData(
              primarySwatch: Colors.blue,
              visualDensity: VisualDensity.adaptivePlatformDensity,
          ),
          home: SpeechScreen();
      );
  }
}

class SpeechScreen extends StatefulWidget {
  @override
  _SpeechScreenState createState() => _SpeechScreenState();
}

class _SpeechScreenState extends State<SpeechScreen> {
    stt.SpeechToText _speech;
    bool _isListening = false;
    String _text = 'Press the button and start speaking';
    double _confidence = 1.0;

    @override
    void initState() {
        super.initState();
        _speech = stt.SpeechToText();
    }


  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
            title: Text('Confidence: ${(_confidence * 100.0).toStringAsFixed(1)}%'),
        ),
    );
  }
}