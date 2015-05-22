#ifndef RASMGR_X_TEST_SERVERGROUPFACTORYMOCK_HH
#define RASMGR_X_TEST_SERVERGROUPFACTORYMOCK_HH

#include "../../../common/src/mock/gmock.h"

#include "../src/servergroupfactory.hh"

namespace rasmgr
{
namespace test
{
class ServerGroupFactoryMock:public rasmgr::ServerGroupFactory
{
public:
    MOCK_METHOD1(createServerGroup, boost::shared_ptr<rasmgr::ServerGroup>(const rasmgr::ServerGroupConfigProto&));
};
}
}

#endif // RASMGR_X_TEST_SERVERGROUPFACTORYMOCK_HH
