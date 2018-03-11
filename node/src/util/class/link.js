class ListNode {
  constructor(value) {
    this.value = value;
    this.next = null;
  }
}

ListNode.prototype.toString = function () {
  let str = this.value;
  let nextNode = this.next;
  while (nextNode) {
    str += ` -> ${nextNode.value}`;
    nextNode = nextNode.next;
  }
  return str;
};

module.exports = {
  ListNode,
};
