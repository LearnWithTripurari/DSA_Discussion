class Node {

  constructor(_data) {
    this.data = _data;
    this.next = null;
  }
}

class SinglyLinkedList {

  constructor() {
    this.head = null
  }

  nodeCreation() {
    const node1 = new Node(1);
    const node2 = new Node(2);
    this.head = node1;
    node1.next = node2;
  }

}

const singlyList = new SinglyLinkedList();

singlyList.nodeCreation()

console.log(singlyList.head)