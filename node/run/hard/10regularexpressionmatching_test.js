import { assert } from 'chai';
import { isMatch } from '../../app/hard/10regularexpressionmatching';

describe('hard', () => {
  describe('10regularexpressionmatching', () => {
    describe('isMatch', () => {
      it('isMatch("aa","a") → false', async () => {
        const expect = false;
        const actual = isMatch('aa', 'a');
        assert.deepEqual(expect, actual);
      });

      it('isMatch("aa","aa") → false', async () => {
        const expect = true;
        const actual = isMatch('aa', 'aa');
        assert.deepEqual(expect, actual);
      });

      it('isMatch("aaa","aa") → false', async () => {
        const expect = false;
        const actual = isMatch('aaa', 'aa');
        assert.deepEqual(expect, actual);
      });

      it('isMatch("aa","a*") → false', async () => {
        const expect = true;
        const actual = isMatch('aa', 'a*');
        assert.deepEqual(expect, actual);
      });

      it('isMatch("aa",".*") → false', async () => {
        const expect = true;
        const actual = isMatch('aa', '.*');
        assert.deepEqual(expect, actual);
      });

      it('isMatch("ab",".*") → false', async () => {
        const expect = true;
        const actual = isMatch('ab', '.*');
        assert.deepEqual(expect, actual);
      });

      it('isMatch("aab","c*a*b*") → false', async () => {
        const expect = true;
        const actual = isMatch('aab', 'c*a*b');
        assert.deepEqual(expect, actual);
      });

      it('isMatch("aaa","aaaa") → false', async () => {
        const expect = false;
        const actual = isMatch('aaa', 'aaaa');
        assert.deepEqual(expect, actual);
      });

      it('isMatch("aaa","ab*a") → false', async () => {
        const expect = false;
        const actual = isMatch('aaa', 'ab*a');
        assert.deepEqual(expect, actual);
      });
    });
  });
});
