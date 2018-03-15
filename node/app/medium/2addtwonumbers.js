import { ListNode } from '../../src/util/class/linkedlist';
import { info } from '../../src/util/logger';
/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
const addTwoNumbers = function (l1, l2) {
  info(`L1: ${l1.toString()}`);
  info(`L2: ${l2.toString()}`);
  let firstValue = l1.value + l2.value;
  let biggerZero = 0;
  if (firstValue >= 10) {
    firstValue -= 10;
    biggerZero++;
  }
  const list = new ListNode(firstValue);

  let l1current = l1.next;
  let l2current = l2.next;
  let current = list;

 // 3 ListNode requir 3 header
  while (l1current || l2current) {
    const l1V = l1current ? l1current.value : 0;
    const l2V = l2current ? l2current.value : 0;

    let val = l1V + l2V + biggerZero;

    if (val >= 10) {
      biggerZero = 1;
      val -= 10;
    } else {
      biggerZero = 0;
    }

    l1current = l1current ? l1current.next : null;
    l2current = l2current ? l2current.next : null;
    const nextNode = new ListNode(val);
    current.next = nextNode;
    current = current.next;
  }
  current.next = biggerZero ? new ListNode(1) : null;
  return list;
};

const convertNode = (list) => {
  info(list);
  let arr = [];
  while(list) {
    arr.push(list.value);
    list = list.next;
  }
  return arr;
};

module.exports = {
  addTwoNumbers,
  convertNode,
};
