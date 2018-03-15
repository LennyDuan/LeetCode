import { addTwoNumbers } from '../../app/medium/2addTwoNumbers';
import { assert } from 'chai';
import { ListNode } from '../../src/util/class/linkedlist';

describe('medium', () => {

  describe('addTwoNumbers', () => {
    describe('addTwoNumbers', () => {
      it('init test', () => {
        const nodeOne2 = new ListNode(2);
        const nodeOne4 = new ListNode(4);
        const nodeOne3 = new ListNode(3);
        nodeOne2.next = nodeOne4;
        nodeOne4.next = nodeOne3;

        const nodeTwo5 = new ListNode(5);
        const nodeTwo6 = new ListNode(6);
        const nodeTwo4 = new ListNode(4);
        nodeTwo5.next = nodeTwo6;
        nodeTwo6.next = nodeTwo4;

        assert.deepEqual(3, nodeOne2.next.next.value);
        assert.deepEqual(4, nodeTwo5.next.next.value);
      });

      it('should complete and return 7 -> 0 -> 8', () => {

        const nodeOne2 = new ListNode(2);
        const nodeOne4 = new ListNode(4);
        const nodeOne3 = new ListNode(3);
        nodeOne2.next = nodeOne4;
        nodeOne4.next = nodeOne3;

        const nodeTwo5 = new ListNode(5);
        const nodeTwo6 = new ListNode(6);
        const nodeTwo4 = new ListNode(4);
        nodeTwo5.next = nodeTwo6;
        nodeTwo6.next = nodeTwo4;

        assert.deepEqual(3, nodeOne2.next.next.value);
        assert.deepEqual(4, nodeTwo5.next.next.value);

        const expert = '7 -> 0 -> 8';
        const result = addTwoNumbers(nodeOne2, nodeTwo5);
        assert.deepEqual(expert, result.toString());
      });

      it('should complete and return 1 -> 8', () => {

        const nodeOne1 = new ListNode(1);
        const nodeOne8 = new ListNode(8);
        nodeOne1.next = nodeOne8;

        const nodeTwo0 = new ListNode(0);

        const expert = '1 -> 8';
        const result = addTwoNumbers(nodeOne1, nodeTwo0);
        assert.deepEqual(expert, result.toString());
      });
    });
  });
});
