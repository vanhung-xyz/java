import 'package:flutter/material.dart';
import 'package:firebase_core/firebase_core.dart';
import 'package:thi_02/pages/navigation_page.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  await Firebase.initializeApp(); // Khởi tạo Firebase
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Head Chef App',
      theme: ThemeData(
        primarySwatch: Colors.green,
      ),
      home: NavigationPage(),
    );
  }
}
