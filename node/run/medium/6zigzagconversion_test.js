import { assert } from 'chai';
import { convert } from '../../app/medium/6zigzagconversion';

describe('medium', () => {
  describe('6zigzagconversion', () => {
    describe('convert', () => {
      it('convert(PAYPALISHIRING, 3) should return PAHNAPLSIIGYIR.', async () => {
        const expect = 'PAHNAPLSIIGYIR';
        const actual = convert('PAYPALISHIRING', 3);
        assert.deepEqual(expect, actual);
      });
    });
  });
});
