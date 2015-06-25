DESCRIPTION = "pyxs"
HOMEPAGE = "http://pypi.python.org/pypi/pyxs"
SECTION = "devel/python"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://AUTHORS;md5=564ff059f45e2ee17acd6594ce1c7b0d"
PR = "r3"

SRCNAME = "pyxs"
SRC_URI = "http://pypi.python.org/packages/source/p/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "03993ea976d507f3f9c51ae66f862dba"
SRC_URI[sha256sum] = "b23e69e1a9aa0f26cf95f4f4b84504e93e986ad7f6ecfc7c1eb2be522b0ff6b1"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

RDEPENDS_${PN} = "python-core python-shell python-re python-lang python-io python-math python-dbus python-threading python-logging"
