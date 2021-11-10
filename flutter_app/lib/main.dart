import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        title: 'Flutter Demo',
        theme: ThemeData(primarySwatch: Colors.blue),
        home: MyHomePage());
  }
}
// 여기까지는 공통 코드입니다.

class MyHomePage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: const Text('Row'),
        ),
        body: PageView(
          children: <Widget>[
            Container(color:Colors.red),
            Container(color:Colors.green),
            Container(color:Colors.blue),
          ],
        )
        // body: GridView.count(
        //   crossAxisCount: 2,
        //   children: <Widget>[
        //     Container(
        //         color: Colors.red,
        //         width: 100,
        //         height: 100,
        //         padding: const EdgeInsets.all(8.0),
        //         margin: const EdgeInsets.all(8.0)
        //     ),
        //     Container(
        //         color: Colors.green,
        //         width: 100,
        //         height: 100,
        //         padding: const EdgeInsets.all(8.0),
        //         margin: const EdgeInsets.all(8.0)
        //     ),
        //     Container(
        //         color: Colors.blue,
        //         width: 200,
        //         height: 200,
        //         padding: const EdgeInsets.all(8.0),
        //         margin: const EdgeInsets.all(8.0)
        //     )
        //   ],
        // )
        // body: Column(
        //   children: <Widget>[
        //     Container(
        //       color: Colors.red,
        //       width: 100,
        //       height: 100,
        //       padding: const EdgeInsets.all(8.0),
        //       margin: const EdgeInsets.all(8.0),
        //     ),
        //     Container(
        //       color: Colors.green,
        //       width: 100,
        //       height: 100,
        //       padding: const EdgeInsets.all(8.0),
        //       margin: const EdgeInsets.all(8.0),
        //     ),
        //     Container(
        //       color: Colors.blue,
        //       width: 100,
        //       height: 100,
        //       padding: const EdgeInsets.all(8.0),
        //       margin: const EdgeInsets.all(8.0),
        //     )
        //   ],
        // ),
        // body: Row(
        //   mainAxisSize: MainAxisSize.max,
        //   mainAxisAlignment: MainAxisAlignment.center,
        //   crossAxisAlignment: CrossAxisAlignment.center,
        //   children: <Widget>[
        //         Container(
        //           color: Colors.red,
        //           width: 100,
        //           height: 100,
        //           padding: const EdgeInsets.all(8.0),
        //           margin: const EdgeInsets.all(8.0),
        //         ),
        //         Container(
        //           color: Colors.green,
        //           width: 100,
        //           height: 100,
        //           padding: const EdgeInsets.all(8.0),
        //           margin: const EdgeInsets.all(8.0),
        //         ),
        //         Container(
        //           color: Colors.blue,
        //           width: 100,
        //           height: 100,
        //           padding: const EdgeInsets.all(8.0),
        //           margin: const EdgeInsets.all(8.0),
        //         )
        //   ],
        // )
        // body: ListView(
        //   scrollDirection: Axis.vertical,
        //   children: const <Widget>[
        //     ListTile(
        //       leading: Icon(Icons.home),
        //       title: Text('home'),
        //       trailing: Icon(Icons.navigate_next),
        //     ),
        //     ListTile(
        //       leading: Icon(Icons.event),
        //       title: Text('Event'),
        //       trailing: Icon(Icons.navigate_next),
        //     ),
        //     ListTile(
        //       leading: Icon(Icons.camera),
        //       title: Text('Camera'),
        //       trailing: Icon(Icons.navigate_next),
        //     ),
        //   ],
        // )
        );
  }
}
