import 'dart:html';



InputElement inputElement;
UListElement uListElement;

void main() {
  inputElement = query('#input-element-test');
  uListElement = query('#ul-element-test');
  query('#root_title').text = "test";
  //query("#sample_text_id")
  //..text = "Click me!"
  //..onClick.listen(reverseText);
}

//void reverseText(MouseEvent event) {
//  var text = query("#sample_text_id").text;
//  var buffer = new StringBuffer();
//  for (int i = text.length - 1; i >= 0; i--) {
//    buffer.write(text[i]);
//  }
//  addtextToRootTitle("");
//  query("#sample_text_id").text = buffer.toString();
//}
//void addtextToRootTitle(String text) {
//  query("#root_title").text = "test";
//}
