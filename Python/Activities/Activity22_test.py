import pytest

def test_sum_numbers():
    a=5
    b=10
    assert a+b == 15

def test_difference_numbers():
    a=15
    b=12
    assert a-b == 3

@pytest.mark.activity
def test_product():
    a=5
    b=10
    assert a*b == 50

@pytest.mark.activity
def test_quotient():
    a=30
    b=6
    assert a/b == 5
    
    