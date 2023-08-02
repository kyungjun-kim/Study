import 'package:flutter/material.dart';

class CCard extends StatelessWidget {
  final String title_a, title_b, name, date;

  const CCard({
    super.key,
    required this.title_a,
    required this.title_b,
    required this.name,
    required this.date,
  });

  @override
  Widget build(BuildContext context) {
    return Container(
        clipBehavior: Clip.hardEdge,
        decoration: BoxDecoration(
          color: Colors.yellow,
          borderRadius: BorderRadius.circular(25),
        ),
        child: Padding(
          padding: const EdgeInsets.all(30),
          child: Row(
            mainAxisAlignment: MainAxisAlignment.start,
            crossAxisAlignment: CrossAxisAlignment.center,
            children: [
              Column(
                children: [
                  Text(
                    title_a,
                    style: const TextStyle(
                        color: Colors.black,
                        fontSize: 60,
                        fontWeight: FontWeight.w600),
                  ),
                  Text(
                    title_b,
                    style: const TextStyle(
                        color: Colors.black,
                        fontSize: 60,
                        fontWeight: FontWeight.w600),
                  ),
                  const SizedBox(
                    height: 10,
                  ),
                ],
              ),
            ],
          ),
        ));
  }
}
