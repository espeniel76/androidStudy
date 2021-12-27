import 'package:flutter/material.dart';
import 'modules/animation/animations.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(),
        body: ListView(
          children: [
            Row(
              children: [
                Icon(Icons.person),
                Text('홍길동')
              ],
            ),
            Row(
              children: [
                Icon(Icons.person),
                Text('홍길동')
              ],
            ),
            Row(
              children: [
                Icon(Icons.person),
                Text('홍길동')
              ],
            )
          ],
        ),
        bottomNavigationBar: CustomBottomBar()
      )
    );
    // return MaterialApp(
        // home: Scaffold(
        //     //Scaffold 는앱을 상/중/하로 나눈다.
        //     appBar: AppBar(
        //       title: Text('앱임'),
        //     ),
        //     body:
        //         // AnimatedAlignScreen(),
        //         // AnimatedContainerScreen(),
        //         // AnimatedDefaultTextStyleScreen(),
        //         // AnimatedOpacityScreen(),
        //         // AnimatedPaddingScreen(),
        //         // AnimatedPhysicalModelScreen(),
        //         // AnimatedPositionedScreen(),
        //         // AnimatedThemeScreen(),
        //         // AnimatedCrossFadeScreen(),
        //         AnimatedSwitcherScreen(),
        //         // AnimatedSizeScreen(),
        //     bottomNavigationBar: BottomAppBar(
        //       child: SizedBox(
        //         height: 50,
        //         child: Row(
        //           mainAxisAlignment: MainAxisAlignment.spaceEvenly,
        //           children: [
        //             Icon(Icons.phone),
        //             Icon(Icons.message),
        //             Icon(Icons.contact_page),
        //           ],
        //         ),
        //       ),
        //     ))
        //     );
  }
}

class CustomBottomBar extends StatelessWidget {
  const CustomBottomBar({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return BottomAppBar(
      child: SizedBox(
        height: 50,
        child: Row(
          mainAxisAlignment: MainAxisAlignment.spaceEvenly,
          children: [
            Icon(Icons.phone),
            Icon(Icons.message),
            Icon(Icons.contact_page)
          ],
        ),
      ),
    );
  }
}


var a = SizedBox(
  child: Text('안녕!!'),
);

class ShopItem extends StatelessWidget {
  const ShopItem({Key? key}) : super(key: key);

  @override
  build(context) {
    return SizedBox(
      child: Text('안녕'),
    );
  }
}
