import pytest

@pytest.mark.activity23
def test_sumOfList(numList):
    sum=0
    for i in numList:
        sum +=i
    assert sum == 55
    

