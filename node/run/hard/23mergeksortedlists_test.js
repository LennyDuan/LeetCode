import { assert } from 'chai';
import { mergeKLists } from '../../app/hard/23mergeksortedlists';
import { ListNode } from '../../src/util/class/linkedlist';

describe('medium', () => {
  describe('23mergeksortedlists', () => {
    describe('mergeKLists', () => {
      const nodeOne2 = new ListNode(2);
      const nodeOne4 = new ListNode(4);
      const nodeOne3 = new ListNode(3);
      nodeOne2.next = nodeOne3;
      nodeOne3.next = nodeOne4;

      const nodeTwo5 = new ListNode(5);
      const nodeTwo6 = new ListNode(6);
      const nodeTwo4 = new ListNode(4);
      nodeTwo4.next = nodeTwo5;
      nodeTwo5.next = nodeTwo6;

      const nodeThree1 = new ListNode(1);
      const nodeThree10 = new ListNode(10);
      const nodeThree8 = new ListNode(8);
      nodeThree1.next = nodeThree8;
      nodeThree8.next = nodeThree10;

      it('should complete return', async () => {
        const lists = [nodeOne2.nodeTwo4];
        const actual = mergeKLists(lists);
        assert.deepEqual(actual, '');
      });
    });
  });
});
