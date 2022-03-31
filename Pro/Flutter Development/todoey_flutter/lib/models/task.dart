import 'package:flutter/cupertino.dart';

class Task {
  Task({this.isDone = false, required this.name});

  final String name;
  bool isDone;

  void toggleDone() {
    isDone = !isDone;
  }
}
