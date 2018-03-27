import { assert } from 'chai';
import { mergeKLists } from '../../app/hard/23mergeksortedlists';
import { ListNode } from '../../src/util/class/linkedlist';

describe('medium', () => {
  describe('23mergeksortedlists', () => {
    describe('mergeKLists', () => {
      const nodeOne2 = new ListNode(2);
      const nodeOne4 = new ListNode(4);
      nodeOne2.next = nodeOne4;

      const nodeTwo3 = new ListNode(5);
      const nodeTwo6 = new ListNode(6);
      nodeTwo3.next = nodeTwo6;

      const nodeThree1 = new ListNode(1);
      const nodeThree5 = new ListNode(5);
      nodeThree1.next = nodeThree5;

      it('should complete return', async () => {
        const lists = [nodeOne2, nodeTwo3];
        const actual = mergeKLists(lists);
        assert.deepEqual(actual.toString(), '2 -> 3 -> 4 -> 6');
      });
    });
  });
});
