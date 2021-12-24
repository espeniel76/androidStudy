import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        home: Scaffold(
      //Scaffold 는앱을 상/중/하로 나눈다.
      appBar: AppBar(title: Text('앱임'),),
      body: Text('안녕'),

      // body: Row(
      //   mainAxisAlignment: MainAxisAlignment.spaceEvenly,
      //   crossAxisAlignment: CrossAxisAlignment.center,
      //   children: [
      //     Icon(Icons.star),
      //     Icon(Icons.star),
      //     Icon(Icons.star),
      //   ],
      // ),
      bottomNavigationBar: BottomAppBar(
        child: SizedBox(
          height: 50,
          child: Row(
            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
            children: [
              Icon(Icons.phone),
              Icon(Icons.message),
              Icon(Icons.contact_page),
            ],
          ),
        ),
      )
    )
        // home: Center(
        //   child: Container(
        //     width: 50,
        //     height: 50,
        //     color: Colors.blue,
        //   ),
        // )
        );
  }
}
