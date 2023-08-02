import 'package:flutter/material.dart';
import 'package:webtoon/widgets/c_card.dart';

void main() {
  runApp(const App());
}

class App extends StatelessWidget {
  const App({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        backgroundColor: const Color.fromARGB(255, 15, 4, 4),
        body: Padding(
            padding: const EdgeInsets.symmetric(horizontal: 15 // 20
                ),
            child:
                Column(crossAxisAlignment: CrossAxisAlignment.start, children: [
              const SizedBox(
                height: 10, //80
              ),
              const Row(
                mainAxisAlignment: MainAxisAlignment.end,
                children: [
                  Column(
                    crossAxisAlignment: CrossAxisAlignment.end,
                    children: [
                      SizedBox(
                        height: 30,
                      ),
                      Text(
                        "+",
                        style: TextStyle(
                          fontSize: 40,
                          color: Colors.white,
                        ),
                      )
                    ],
                  )
                ],
              ),
              const SizedBox(
                height: 10, //120
              ),
              Text(
                "MONDAY 16",
                style: TextStyle(
                  fontSize: 17,
                  color: Colors.white.withOpacity(0.8),
                ),
              ),
              const SizedBox(
                height: 5,
              ),
              Container(
                clipBehavior: Clip.hardEdge,
                decoration: const BoxDecoration(),
                child: const Row(children: [
                  Text(
                    "TODAY 17 18 19 20",
                    style: TextStyle(
                      fontSize: 44,
                      fontWeight: FontWeight.w400,
                      color: Colors.white,
                    ),
                  ),
                ]),
              ),
              const SizedBox(
                height: 40, //100
              ),
              const CCard(
                  title_a: "DESIGN",
                  title_b: "MEETING",
                  name: "ALEX",
                  date: "1130"),
            ])),
      ),
    );
  }
}
