import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';

class AnimatedAlignScreen extends StatefulWidget {
  const AnimatedAlignScreen({Key? key}) : super(key: key);

  @override
  _AnimatedAlignScreenState createState() => _AnimatedAlignScreenState();
}

class _AnimatedAlignScreenState extends State<AnimatedAlignScreen> {
  var alignment = Alignment.bottomLeft;

  @override
  Widget build(BuildContext context) {
    return Container(
      padding: EdgeInsets.all(30.0),
      child: Column(
        children: <Widget>[
          Expanded(
            child: AnimatedAlign(
              alignment: alignment,
              duration: Duration(milliseconds: 1000),
              child: FlutterLogo(size: 150),
            ),
          ),
          TextButton(
            child: Text('alignment change'),
            onPressed: () {
              setState(() {
                alignment = alignment == Alignment.bottomLeft
                    ? Alignment.topRight
                    : Alignment.bottomLeft;
              });
            },
          )
        ],
      ),
    );
  }
}

class AnimatedContainerScreen extends StatefulWidget {
  const AnimatedContainerScreen({Key? key}) : super(key: key);

  @override
  _AnimatedContainerScreenState createState() =>
      _AnimatedContainerScreenState();
}

class _AnimatedContainerScreenState extends State<AnimatedContainerScreen> {
  bool selected = false;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('AnimatedContainer')),
      body: GestureDetector(
        onTap: () {
          setState(() {
            selected = !selected;
          });
        },
        child: Center(
          child: AnimatedContainer(
            width: selected ? 300.0 : 100.0,
            height: selected ? 100.0 : 300.0,
            alignment:
                selected ? Alignment.center : AlignmentDirectional.topCenter,
            duration: Duration(milliseconds: 500),
            decoration: BoxDecoration(
              border: selected
                  ? Border.all(color: Colors.black, width: 3)
                  : Border.all(color: Colors.red, width: 3),
              gradient: LinearGradient(
                begin: FractionalOffset.topCenter,
                end: FractionalOffset.bottomCenter,
                colors: selected
                    ? [Colors.lightGreen, Colors.redAccent]
                    : [Colors.orange, Colors.deepOrangeAccent],
                stops: [0.0, 1.0],
              ),
              color: selected ? Colors.red : Colors.blue,
            ),
            curve: Curves.fastOutSlowIn,
            child: FlutterLogo(size: 75),
          ),
        ),
      ),
    );
  }
}

class AnimatedDefaultTextStyleScreen extends StatefulWidget {
  const AnimatedDefaultTextStyleScreen({Key? key}) : super(key: key);

  @override
  _AnimatedDefaultTextStyleScreenState createState() =>
      _AnimatedDefaultTextStyleScreenState();
}

class _AnimatedDefaultTextStyleScreenState
    extends State<AnimatedDefaultTextStyleScreen> {
  bool selected = false;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('AnimatedDefaultTextStyle')),
      body: GestureDetector(
        onTap: () {
          setState(() {
            selected = !selected;
          });
        },
        child: Center(
          child: SizedBox(
            height: 120,
            child: AnimatedDefaultTextStyle(
              duration: const Duration(milliseconds: 300),
              style: TextStyle(
                fontSize: 50.0,
                color: selected ? Colors.red : Colors.blueAccent,
                fontWeight: selected ? FontWeight.w100 : FontWeight.bold,
              ),
              child: Text('Flutter'),
            ),
          ),
        ),
      ),
    );
  }
}

class AnimatedOpacityScreen extends StatefulWidget {
  const AnimatedOpacityScreen({Key? key}) : super(key: key);

  @override
  _AnimatedOpacityScreenState createState() => _AnimatedOpacityScreenState();
}

class _AnimatedOpacityScreenState extends State<AnimatedOpacityScreen> {
  bool selected = false;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('AnimatedOpacity')),
      body: GestureDetector(
        onTap: () {
          setState(() {
            selected = !selected;
          });
        },
        child: Center(
          child: Container(
            height: 120.0,
            width: 120.0,
            color: Colors.blue[50],
            child: AnimatedOpacity(
              opacity: selected ? 0.0 : 1.0,
              duration: Duration(milliseconds: 500),
              child: FlutterLogo(
                size: 60,
              ),
            ),
          ),
        ),
      ),
    );
  }
}

class AnimatedPaddingScreen extends StatefulWidget {
  const AnimatedPaddingScreen({Key? key}) : super(key: key);

  @override
  _AnimatedPaddingScreenState createState() => _AnimatedPaddingScreenState();
}

class _AnimatedPaddingScreenState extends State<AnimatedPaddingScreen> {
  bool selected = false;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('AnimatedPadding')),
      body: GestureDetector(
        onTap: () {
          setState(() {
            selected = !selected;
          });
        },
        child: Center(
          child: SizedBox(
            height: 300.0,
            width: 300.0,
            child: AnimatedPadding(
              padding: selected
                  ? EdgeInsets.only(top: 100, bottom: 100)
                  : EdgeInsets.only(left: 100, right: 100),
              curve: Curves.ease,
              duration: Duration(seconds: 1),
              child: Container(
                color: Colors.blue,
                child: Center(child: Text('Flutter')),
              ),
            ),
          ),
        ),
      ),
    );
  }
}

class AnimatedPhysicalModelScreen extends StatefulWidget {
  const AnimatedPhysicalModelScreen({Key? key}) : super(key: key);

  @override
  _AnimatedPhysicalModelScreenState createState() =>
      _AnimatedPhysicalModelScreenState();
}

class _AnimatedPhysicalModelScreenState
    extends State<AnimatedPhysicalModelScreen> {
  bool selected = false;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('AnimatedPhysicalModel')),
      body: GestureDetector(
        onTap: () {
          setState(() {
            selected = !selected;
          });
        },
        child: Center(
          child: AnimatedPhysicalModel(
            duration: const Duration(milliseconds: 500),
            curve: Curves.fastOutSlowIn,
            elevation: selected ? 0 : 6.0,
            shape: BoxShape.rectangle,
            shadowColor: Colors.black,
            color: Colors.white,
            borderRadius: selected
                ? const BorderRadius.all(Radius.circular(0))
                : const BorderRadius.all(Radius.circular(10)),
            child: Container(
              height: 120.0,
              width: 120.0,
              color: Colors.blue[50],
              child: FlutterLogo(
                size: 60,
              ),
            ),
          ),
        ),
      ),
    );
  }
}

class AnimatedPositionedScreen extends StatefulWidget {
  const AnimatedPositionedScreen({Key? key}) : super(key: key);

  @override
  _AnimatedPositionedScreenState createState() =>
      _AnimatedPositionedScreenState();
}

class _AnimatedPositionedScreenState extends State<AnimatedPositionedScreen> {
  bool selected = false;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('AnimatedPositioned')),
      body: GestureDetector(
        onTap: () {
          setState(() {
            selected = !selected;
          });
        },
        child: Stack(
          children: <Widget>[
            AnimatedPositioned(
              duration: const Duration(milliseconds: 500),
              curve: Curves.fastOutSlowIn,
              left: selected ? 10 : 100,
              top: selected ? 70 : 100,
              right: selected ? 10 : 100,
              bottom: selected ? 70 : 100,
              child: Container(
                color: Colors.blue,
              ),
            ),
          ],
        ),
      ),
    );
  }
}

class AnimatedThemeScreen extends StatefulWidget {
  const AnimatedThemeScreen({Key? key}) : super(key: key);

  @override
  _AnimatedPositionedDirectionalScreenState createState() =>
      _AnimatedPositionedDirectionalScreenState();
}

class _AnimatedPositionedDirectionalScreenState
    extends State<AnimatedThemeScreen> with SingleTickerProviderStateMixin {
  bool selected = false;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('AnimatedTheme')),
      body: GestureDetector(
        onTap: () {
          setState(() {
            selected = !selected;
          });
        },
        child: AnimatedTheme(
          data: selected ? ThemeData.light() : ThemeData.dark(),
          duration: const Duration(milliseconds: 500),
          child: Center(
            child: Card(
              child: const Padding(
                padding: EdgeInsets.all(16),
                child: Text(
                  'theme',
                  style: TextStyle(fontSize: 24),
                ),
              ),
            ),
          ),
        ),
      ),
    );
  }
}

class AnimatedCrossFadeScreen extends StatefulWidget {
  const AnimatedCrossFadeScreen({Key? key}) : super(key: key);

  @override
  _AnimatedCrossFadeScreenState createState() =>
      _AnimatedCrossFadeScreenState();
}

class _AnimatedCrossFadeScreenState extends State<AnimatedCrossFadeScreen> {
  bool selected = false;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('AnimatedCrossFade')),
      body: GestureDetector(
          onTap: () {
            setState(() {
              selected = !selected;
            });
          },
          child: Center(
            child: AnimatedCrossFade(
              duration: const Duration(milliseconds: 500),
              firstChild: const FlutterLogo(
                  style: FlutterLogoStyle.horizontal, size: 100.0),
              secondChild: const FlutterLogo(
                  style: FlutterLogoStyle.stacked, size: 100.0),
              crossFadeState: selected
                  ? CrossFadeState.showFirst
                  : CrossFadeState.showSecond,
            ),
          )),
    );
  }
}

class AnimatedSwitcherScreen extends StatefulWidget {
  const AnimatedSwitcherScreen({Key? key}) : super(key: key);

  @override
  _AnimatedSwitcherScreenState createState() => _AnimatedSwitcherScreenState();
}

class _AnimatedSwitcherScreenState extends State<AnimatedSwitcherScreen> {
  int _count = 0;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('AnimatedSwitcher')),
      body: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        crossAxisAlignment: CrossAxisAlignment.stretch,
        children: <Widget>[
          AnimatedSwitcher(
            duration: const Duration(milliseconds: 300),
            transitionBuilder: (Widget child, Animation<double> animation) {
              return ScaleTransition(child: child, scale: animation);
            },
            child: Text(
              '$_count',
              key: ValueKey<int>(_count),
              style: Theme.of(context).textTheme.headlineLarge,
            ),
          ),
          Container(
            padding: EdgeInsets.all(30.0),
            child: RaisedButton(
              child: const Text('Increment'),
              onPressed: () {
                setState(() {
                  _count += 7325;
                });
              },
            ),
          ),
        ],
      ),
    );
  }
}

class AnimatedSizeScreen extends StatefulWidget {
  const AnimatedSizeScreen({Key? key}) : super(key: key);

  @override
  _AnimatedSizeScreenState createState() => _AnimatedSizeScreenState();
}

class _AnimatedSizeScreenState extends State<AnimatedSizeScreen>
    with SingleTickerProviderStateMixin {
  bool selected = false;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('AnimatedSize')),
      body: GestureDetector(
        onTap: () {
          setState(() {
            selected = !selected;
          });
        },
        child: SizedBox(
          height: 300,
          child: Center(
            child: AnimatedSize(
              duration: const Duration(milliseconds: 500),
              curve: Curves.fastOutSlowIn,
              child: Container(
                width: selected ? 300 : 200,
                height: selected ? 160 : 200,
                color: Colors.blue,
              ),
              vsync: this,
            ),
          ),
        ),
      ),
    );
  }
}
